package com.ho8c;

/**
 * Created by chris.scites on 6/12/2017.
 */
public class Client {
    private String opportunityName;
    private String type;
    private String amount;
    private String closeDate;
    private String fiscalPeriod;
    private String accountName;
    private String leadSource;
    private String billingState;
    private String primaryCampaignSource;
    private String marketingCampaign;
    private String opportunityOwner;

    public Client(String opportunityName, String type, String amount, String closeDate, String fiscalPeriod,
                  String accountName, String leadSource, String billingState, String primaryCampaignSource,
                  String marketingCampaign, String opportunityOwner){
        this.opportunityName = opportunityName;
        this.type = type;
        this.amount = amount;
        this.closeDate = closeDate;
        this.fiscalPeriod = fiscalPeriod;
        this.accountName = accountName;
        this.leadSource = leadSource;
        this.billingState = billingState;
        this.primaryCampaignSource = primaryCampaignSource;
        this.marketingCampaign = marketingCampaign;
        this.opportunityOwner = opportunityOwner;
    }

    public String getOpportunityName(){
        return opportunityName;
    }

    public String getType(){
        return type;
    }

    public String getAmount(){
        return amount;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public String getFiscalPeriod() {
        return fiscalPeriod;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public String getMarketingCampaign() {
        return marketingCampaign;
    }

    public String getPrimaryCampaignSource() {
        return primaryCampaignSource;
    }

    public String getOpportunityOwner() {
        return opportunityOwner;
    }

}
