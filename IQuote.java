import java.util.Date;
/**
 * Created with IntelliJ IDEA.
 * User: Artem
 * Date: 03.04.13
 * Time: 21:20
 * To change this template use File | Settings | File Templates.
 */
public interface IQuote {
    /**
     * @return String that represent symbol of the quote
     */
    public String getSymbol();
    /**
     * @return Date that represent time of the quote
     */
    public Date getDate();
    /**
     * @return open price of the stock
     */
    public double getOpenPrice();
    /**
     * @return high price of the stock
     */
    public double getHighPrice();
    /**
     * @return low price of the stock
     */
    public double getLowPrice();
    /**
     * @return close price of the stock
     */
    public double getClosePrice();
    /**
     * @return volume of the stocks
     */
    public double getVolume();
}
