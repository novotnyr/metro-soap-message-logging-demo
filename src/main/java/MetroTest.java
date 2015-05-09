
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;
import sk.upjs.ics.novotnyr.msmld.StockQuote;
import sk.upjs.ics.novotnyr.msmld.StockQuoteSoap;

public class MetroTest {
	public static final Logger logger = LoggerFactory.getLogger(MetroTest.class);

	public static void main(String[] args) {

		SLF4JBridgeHandler.removeHandlersForRootLogger();
		SLF4JBridgeHandler.install();

		logger.info("JUL->SLF4J Bridge initialized");

		StockQuote stockQuote = new StockQuote();
		StockQuoteSoap port = stockQuote.getStockQuoteSoap();
		String usd = port.getQuote("USD");
		System.out.println(usd);
	}
}


