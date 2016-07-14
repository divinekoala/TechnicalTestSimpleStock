import java.time.LocalDateTime;

public class Trade {
	
	private TradeType tradeType;
	private Stock stock;
	private LocalDateTime localDateTime;
	private int quantity;
	private float tickerPrice;
	
	
	
	public Trade(TradeType tradeType, Stock stock, LocalDateTime localDateTime, int quantity, float tickerPrice) {
		super();
		this.tradeType = tradeType;
		this.stock = stock;
		this.localDateTime = localDateTime;
		this.quantity = quantity;
		this.tickerPrice = tickerPrice;
	}

	public TradeType getTradeType() {
		return tradeType;
	}
	
	public void setTradeType(TradeType tradeType) {
		this.tradeType = tradeType;
	}
	
	public Stock getStock() {
		return stock;
	}
	
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	public LocalDateTime getDate() {
		return localDateTime;
	}
	
	public void setDate(LocalDateTime date) {
		this.localDateTime = date;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public float getTickerPrice() {
		return tickerPrice;
	}
	
	public void setTickerPrice(float tickerPrice) {
		this.tickerPrice = tickerPrice;
	}
	
	public String toString(){
		return stock.getStockSymbol() + ": " + localDateTime + " : No. Traded " + quantity + " : Price " + tickerPrice;
		
	}
}
