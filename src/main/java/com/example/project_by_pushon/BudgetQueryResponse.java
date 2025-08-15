package com.example.project_by_pushon;

     public class BudgetQueryResponse {

         private String queryId;
         private String queryTopic;
         private String response;
         private String queriedBy;
         private String responseDate;

         public BudgetQueryResponse(String queryId, String queryTopic, String response, String queriedBy, String responseDate) {
             this.queryId = queryId;
             this.queryTopic = queryTopic;
             this.response = response;
             this.queriedBy = queriedBy;
             this.responseDate = responseDate;
         }

         public String getQueryId() {
             return queryId;
         }

         public void setQueryId(String queryId) {
             this.queryId = queryId;
         }

         public String getQueryTopic() {
             return queryTopic;
         }

         public void setQueryTopic(String queryTopic) {
             this.queryTopic = queryTopic;
         }

         public String getResponse() {
             return response;
         }

         public void setResponse(String response) {
             this.response = response;
         }

         public String getQueriedBy() {
             return queriedBy;
         }

         public void setQueriedBy(String queriedBy) {
             this.queriedBy = queriedBy;
         }

         public String getResponseDate() {
             return responseDate;
         }

         public void setResponseDate(String responseDate) {
             this.responseDate = responseDate;
         }

         @Override
         public String toString() {
             return "BudgetQueryResponse{" +
                     "queryId='" + queryId + '\'' +
                     ", queryTopic='" + queryTopic + '\'' +
                     ", response='" + response + '\'' +
                     ", queriedBy='" + queriedBy + '\'' +
                     ", responseDate='" + responseDate + '\'' +
                     '}';
         }
     }