
public class Stock {

	private String stockSymbol;
	private StockType stockType;
	private int lastDividend;
	private int fixedDividend;
	private int parValue;
	
	public Stock(String stockSymbol, StockType stockType, int lastDividend, int fixedDividend, int parValue){
		this.stockSymbol = stockSymbol;
		this.stockType = stockType;
		this.lastDividend = lastDividend;
		this.fixedDividend = fixedDividend;
		this.parValue = parValue;
	}
	
	public String getStockSymbol() {
		return stockSymbol;
	}
	
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	
	public StockType getStockType() {
		return stockType;
	}
	
	public void setStockType(StockType stockType) {
		this.stockType = stockType;
	}
	
	public int getLastDividend() {
		return lastDividend;
	}
	
	public void setLastDividend(int lastDividend) {
		this.lastDividend = lastDividend;
	}
	
	public int getFixedDividend() {
		return fixedDividend;
	}
	
	public void setFixedDividend(int fixedDividend) {
		this.fixedDividend = fixedDividend;
	}
	
	public int getParValue() {
		return parValue;
	}
	
	public void setParValue(int parValue) {
		this.parValue = parValue;
	}
	
}
