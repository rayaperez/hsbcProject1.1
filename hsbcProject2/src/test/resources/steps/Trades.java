package steps;

public class Trades {

	private string TradeId;
	private string TradeDtTime ;
	private string InID ;
	private string qty ;
	private string price ;
	private int amount ;
	private string trader ;
	
	public String getTradeId()
	{
	  return this.TradeId;
	}
	public void setTradeId(String TradeId)
	{
		this.TradeId = TradeId;
	}
	public String getTradeDtTime()
	{
	  return this.TradeDtTime;
	}
	public void setTradeDtTime(String TradeDtTime)
	{
		this.TradeDtTime = TradeDtTime;
	}
}
