package com.liferay.training.userindexerpostprocessor;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.IndexerPostProcessor;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.search.filter.BooleanFilter;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
        property = {
                "indexer.class.name=com.liferay.portal.kernel.model.User"
        },
        service = IndexerPostProcessor.class
        )

public class UserIndexerPostProcessor implements IndexerPostProcessor {

	@Override
	public void postProcessContextBooleanFilter(BooleanFilter booleanFilter, SearchContext searchContext)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postProcessDocument(Document document, Object object) throws Exception {

		 System.out.println("Indexer Post process Document is running");
	        User user = (User)object;
	        int male = 0;
	        int female = 0;
	        
	        if(user.isMale()) {
	            male=1;
	        }
	        if(user.isFemale()) {
	            female=2;
	        }
	        document.addNumber("male", male);
	        document.addNumber("female", female);
	    }

	

	@Override
	public void postProcessFullQuery(BooleanQuery fullQuery, SearchContext searchContext) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery, BooleanFilter booleanFilter,
			SearchContext searchContext) throws Exception {
		 System.out.println("Inside of search process query runinng");
		    
		    String keywords = searchContext.getKeywords();
		    
		    if(keywords==null) {
		        return;
		    }
		    searchQuery.addTerm("UserId", searchContext.getKeywords());
		    
		    if(keywords.contains("boys") || keywords.contains("men")) {
		        searchQuery.addTerm("male", 1);
		    }
		    if(keywords.contains("girls") || keywords.contains("ladies") || keywords.contains("female")) {
		        searchQuery.addTerm("female", 2);
		    }
		    }
	@Override
	public void postProcessSummary(Summary summary, Document document, Locale locale, String snippet) {
		// TODO Auto-generated method stub

	}

}
