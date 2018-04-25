package steps;

import java.util.Date;

import org.apache.log4j.Logger;

import gherkin.ast.DataTable;

import static org.junit.Assert.*;
public class TradesInOutDateRange : CommonSteps {
	
	private String newDateFrom;
	private String newDateTo;
	final String OLD_FORMAT = "dd/MM/yyyy";
	final String NEW_FORMAT = "yyyy-MM-dd";
	final static java.util.logging.Logger logger = Logger.getLogger(CommonSteps.class);
	/**
	 * To simplify the comparison I decided to convert date to specific format
	 * Checking if provided is a valid date
	 * @param  dateFrom file name that user provided
	 */
    @Given("^I have a range date from \"([^\"]*)\"$")
	public void dateFrom(String dateFrom) {
    	assertTrue(ValidateDate(dateFrom),true)
    	newDateFrom = convertDateFormat(dateFrom);
	}
    
    /**
	 * To simplify the comparison I decided to convert date to specific format
	 * Checking if provided is a valid date
	 * @param  dateTo file name that user provided
	 */
    @Given("^I have a date to \"([^\"]*)\"$")
	public void dateTo(String dateTo) {
    	assertTrue((ValidateDate(dateTo),true)
    	newDateTo = convertDateFormat(dateTo);
	}


    /**
	 * Here I am only checking that to date is higer then from date
	 * @return fail with from > to
	 */
	@When("^I check trade transactions for that range$")
	public void tradeDateRange() {
		assertThat("dates",newDateFrom,greaterThan(newDateTo);
        logger.error(String.format("Invalid date, From date %s is Lower then To date %s", sdf.format(newDateFrom),sdf.format(newDateTo)));
        }
	}
	/**
	 * Looping through the trades and checking one by one if instruction is presented
	 * If it presented, checking if it inside or outside the date range
	 * If not not presented, getting to the next trade name
	 */
	@Then("^I receive an output if trade is in or out$")
	public void outputInOutTrades() {
		int countTrandedElements = 0;
		int countNottradedElemets = 0;
		
		for (Trades trade : trades) {
			String tradeInID = trade.InID;
			
			for(Instrument instrument : instruments) {
				String instInID = instrument.instid
						
				if(tradeInID.equals(instInID)) {
			    	String dateofTrade =  convertDateFormat(trade.TradeDtTime);
			    	
			    	if((dateofTrade.compareTo(newDateFrom)>0 && dateofTrade.compareTo(newDateTo)<0) ||
			    		dateofTrade.compareTo(newDateFrom)==0 && dateofTrade.compareTo(newDateTo)<0)
			    		dateofTrade.compareTo(newDateFrom)>0 && dateofTrade.compareTo(newDateTo)==0))
	                   
    	                 countTrandedElements++;
						  logger.error(String.format("Instrument %s%n traded in the given range date " , instrument.instname));
			    }
			    else {
			      countNottradedElemets++;
			      logger.error(String.format("Instrument %s%n is not traded in the given range date " , instrument.instname));
			    }
			 }
			    System.out.println("Number of Traded in range is  %s and out of range is %s",countTrandedElements,countNottradedElemets );
		}
	}

	private String convertDateFormat(String oldDate)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
		Date oldDateParse= sdf.parse(oldDate);
		sdf.applyPattern(NEW_FORMAT);
		return sdf.format(oldDateParse);
	}
	
	private boolean validateDate(string date)
	{
		if(date == null){
			return false;
			}
		SimpleDateFormat sdf = new SimpleDateFormat(date);
		sdf.setLenient(false);
		try {
			Date date = sdf.parse(dateToValidate);
			} catch (ParseException e) {	
				e.printStackTrace();
				return false;
			}
		return true;
	}
}
