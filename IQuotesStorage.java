import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * Created with IntelliJ IDEA.
 * User: Artem
 * Date: 03.04.13
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 */
public interface IQuotesStorage
{
    /**
     * @param add quote to storage
     */
    public void addStock(IQuote stock);
    /**
     * @param begin date of the interval
     * @param end date of the interval
     * @return Map where key is quote symbol and value is ordered list
    of the quotes
     */
    public Map<String, List<IQuote>> getStocks(Date begin, Date end);
    /**
     * Get quotes for specified symbol
     * @param symbol is required kind of quote
     * @param begin date of the interval
     * @param end date of the interval
     * @return ordered list of the quotes
     */
    public List<IQuote> getStocks(String symbol, Date begin, Date end);
    /**
     * Clear the storage
     */
    public void clear();
    /**
     * Remove specified quote from storage
     * @param stock to remove.
     */
    public void remove(IQuote stock);
}