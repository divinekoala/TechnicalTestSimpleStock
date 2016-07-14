import java.util.List;

public class StockCalculations {
	
	StockTrade stockTrade = new StockTrade();

	public float dividendYeild(Stock stock, float tickerPrice) {
		if(stock.getStockType() == StockType.Common){
			return stock.getLastDividend() / tickerPrice;
		} else {
			return stock.getLastDividend() * stock.getParValue() / tickerPrice;
		}
		
	}

	public float peRatio(Stock stock, float tickerPrice) {
		return tickerPrice / stock.getLastDividend();
	}
	
	public float getAllShareIndex(List<Stock> stocks, List<Trade> trades){
		float allShareIndex = 0f;
		for (Stock stock : stocks){
			allShareIndex += stockTrade.GetStockPrice(trades, stock);
		}
		
		return (float) Math.pow(allShareIndex, 1.0/stocks.size());
	}

}
