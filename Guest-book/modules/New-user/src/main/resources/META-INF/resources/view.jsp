<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page
	import="com.liferay.portal.kernel.service.CountryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Country"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp"%>

<portlet:actionURL var="signupURL" name="signupURL" />
<portlet:resourceURL var="checkAvailabilityURL" id="/check_availability" />
<aui:form action="${signupURL}" method="POST"
    enctype="multipart/form-data">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <aui:input name="screenName" label="" placeholder="Screen Name"></aui:input>
                <aui:input name="firstName" label="" placeholder="First Name"></aui:input>
                <aui:input name="lastName" label="" placeholder="Last Name"></aui:input>
                <aui:input name="emailAddress" label="" placeholder="Email Address"></aui:input>
                <aui:input name="dateOfBirth" type="date" label="DOB"></aui:input>
                <aui:input name="jobTitle" label="" placeholder="Job Title"></aui:input>
            </div>
            <div class="col-md-6">
                <div class="row">
                    <div class="col-md-8">
                        <aui:input type="file" id="selectedImg" name="profPict"
                            accept="image/*" label="Profile Picture" />
                    </div>
                    <div class="col-md-4">
                        <img id="blah" src="" alt="your image" width="100px"
                            height="100px" />
                    </div>
                </div>

                <aui:input name="panCard" label="" placeholder="Pan Card"></aui:input>
                <aui:input name="aadhaarCard" label="" placeholder="Aadhaar Card"></aui:input>
                <%
                    List<Country> countryList = CountryLocalServiceUtil
                                .getCompanyCountries(PortalUtil.getDefaultCompanyId());
                %>
                <aui:select name="countryId" label="Country">
                    <aui:option label="Select a Country" value="" />
                    <%
                        for (Country countryItem : countryList) {
                    %>
                    <aui:option label="<%=countryItem.getName().toUpperCase()%>"
                        value="<%=countryItem.getCountryId()%>" />
                    <%
                        }
                    %>
                </aui:select>
                <aui:select name="regionId" label="Region">
                    <aui:option label="Select a Region" value="" />
                </aui:select>
            </div>
        </div>
    </div>
    <aui:button type="submit"></aui:button>
</aui:form>
</div>
</div>

<aui:script use="liferay-service">
    Liferay.Service(
        '/country/get-countries',
        {},
        function(countries) {
            var countrySelect = document.getElementById('<portlet:namespace />countryId');
            countries.forEach(function(country) {
                var option = document.createElement('option');
                option.text = country.nameCurrentValue;
                option.value = country.countryId;
                countrySelect.add(option);
            });

            countrySelect.addEventListener('change', function() {
                var countryId = this.value;

                Liferay.Service(
                    '/region/get-regions',
                    {
                        countryId: countryId
                    },
                    function(regions) {
                        var regionSelect = document.getElementById('<portlet:namespace />regionId');
                        regionSelect.innerHTML = '';
                        regions.forEach(function(region) {
                            var option = document.createElement('option');
                            option.text = region.name;
                            option.value = region.regionId;
                            regionSelect.add(option);
                        });
                    }
                );
            });
        }
    );

    function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#blah').attr('src', e.target.result);
            }

            reader.readAsDataURL(input.files[0]);
        }
    }

    $("#<portlet:namespace />selectedImg").change(function(){
        readURL(this);
    });

    $('#aadhaarCardavailable').hide();
    $('#panCardAvailable').hide();

    $("#<portlet:namespace />aadhaarCard").on("change", function() {
        var aadhaar = $(this).val();
        console.log("Entered aadhaar:::" + aadhaar);
        $.ajax({
            async: false,
            cache: false,
            data: {
                "<portlet:namespace />aadhaarCard": aadhaar
            },
            url: '${checkAvailabilityURL}',
            success: function(result) {
                var response = JSON.parse(result);
                console.log("Aadhaar availability:::::::" + response.aadhaarAvailability);
                if (response.aadhaarAvailability == "yes") {
                    alert('Great! This Aadhaar number is available to use.');
                } else {
                    alert('Sorry! This Aadhaar number is already in use.');
                }
            }
        });
    });

    $("#<portlet:namespace />panCard").on("change", function() {
        var panCard = $(this).val();
        console.log("Entered panCard:::" + panCard);
        $.ajax({
            async: false,
            cache: false,
            data: {
                "<portlet:namespace />panCard": panCard
            },
            url: '${checkAvailabilityURL}',
            success: function(result) {
                var response = JSON.parse(result);
                console.log("PAN availability:::::::" + response.panAvailability);
                if (response.panAvailability == "yes") {
                    alert('Great! This PAN number is available to use.');
                } else {
                    alert('Sorry! This PAN number is already in use.');
                }
            }
        });
    });
</aui:script>







