import java.util.ArrayList;
import java.util.List;

public class DoTest {

	public static void main(String[] args) {
		Stock TEA = new Stock("TEA", StockType.Common, 0, 0, 100);
		Stock POP = new Stock("POP", StockType.Common, 8, 0, 100);
		Stock ALE = new Stock("ALE", StockType.Common, 23, 0, 60);
		Stock GIN = new Stock("GIN",StockType.Preferred, 8, 2, 100);
		Stock JOE = new Stock("JOE", StockType.Common, 13, 0, 250);

		StockCalculations calc = new StockCalculations();
		System.out.println(calc.dividendYeild(POP, 10));
		System.out.println(calc.peRatio(POP, 10));
		
		StockTrade stockTrade = new StockTrade();
		
		Trade testTrade = stockTrade.BuyStock(POP, 3, 10);
		System.out.println(testTrade.toString());
		
		Trade testTrade1 = stockTrade.BuyStock(POP, 3, 12);
		Trade testTrade2 = stockTrade.BuyStock(POP, 5, 11);
		Trade testTrade3 = stockTrade.BuyStock(GIN, 2, 13);
		
		List<Trade> trades = new ArrayList<Trade>();
		trades.add(testTrade1);
		trades.add(testTrade2);
		trades.add(testTrade3);
		
		float stockprice = stockTrade.GetStockPrice(trades, POP);
		System.out.println(stockprice);
		
		List<Stock> stocks = new ArrayList<Stock>();
		stocks.add(TEA);
		stocks.add(POP);
		stocks.add(ALE);
		stocks.add(GIN);
		stocks.add(JOE);
		
		float aSI = calc.getAllShareIndex(stocks, trades);
		System.out.println(aSI);
	}

}
