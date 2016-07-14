import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StockTrade {

	public Trade BuyStock(Stock stock, int quantity, float tickerPrice){
		return new Trade(TradeType.Buy, stock, LocalDateTime.now(), quantity, tickerPrice);
	}
	
	public Trade SellStock(Stock stock, int quantity, float tickerPrice){
		return new Trade(TradeType.Sell, stock, LocalDateTime.now(), quantity, tickerPrice);
	}
	
	public float GetStockPrice(List<Trade> trades, Stock stock){
		List<Trade> tempList = new ArrayList<Trade>();
		LocalDateTime fifteenMinutesAgo = LocalDateTime.now().minusMinutes(15);
		for (Trade trade : trades) {
			if(trade.getStock().getStockSymbol() == stock.getStockSymbol()){	
				if(fifteenMinutesAgo.isBefore(trade.getDate())){
					tempList.add(trade);
				}
			}
		}
		
		if(tempList.size() == 0){
			return 0;
		}
		
		float stockPrice = 0f;
		int totalQuantity = 0;
		for (Trade tl : tempList){
			totalQuantity += tl.getQuantity();
			stockPrice += tl.getTickerPrice() * tl.getQuantity();
		}
		
		return stockPrice/totalQuantity;
		
	}
	
}
