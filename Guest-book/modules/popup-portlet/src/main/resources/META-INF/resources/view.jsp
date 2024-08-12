<%@ include file="/init.jsp" %>

<%
    String documentLibraryURL = (String) request.getAttribute("documentLibraryURL");
%>

<button onclick="openPopup()">Add Files</button>

<div id="fileUploadPopup" style="display:none;">
    <form id="fileUploadForm" enctype="multipart/form-data">
        <h3>Upload Files</h3>
       
        <input type="button" value="choose" onclick="openDocumentMediaLibrary()" /><br>
        <input type="button" value="choose1" onclick="openDocumentMediaLibrary()" /><br>
        <input type="button" value="choose2" onclick="openDocumentMediaLibrary()" /><br>
       
        <button type="button" onclick="uploadFiles()">Upload</button>
        <button type="button" onclick="closePopup()">Cancel</button>
    </form>
</div>

<aui:script>
    window['<portlet:namespace />displayPopup'] = function (url, title) {
        Liferay.Util.openModal({
            iframeBodyCssClass: 'portlet-my-subscription',
            size: 'full-screen',
            title: title,
            url: url,
        });
    };

    function openDocumentMediaLibrary() {
        var documentLibraryURL = "<%= documentLibraryURL %>";
        window['<portlet:namespace />displayPopup'](documentLibraryURL, 'Document and Media Library');
    }

    function openPopup() {
        document.getElementById('fileUploadPopup').style.display = 'block';
    }

    function closePopup() {
        document.getElementById('fileUploadPopup').style.display = 'none';
    }

    function uploadFiles() {
        var formData = new FormData(document.getElementById('fileUploadForm'));

        $.ajax({
            url: 'group/guest/documents', 
            type: 'POST',
            data: formData,
            processData: false,
            contentType: false,
            success: function(response) {
                alert("Files uploaded successfully.");
                closePopup();
                openDocumentMediaLibrary();
            },
            error: function(xhr, status, error) {
                alert("An error occurred while uploading files: " + error);
            }
        });
    }
</aui:script>

