import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Artem
 * Date: 03.04.13
 * Time: 21:21
 * To change this template use File | Settings | File Templates.
 */
public class Quote implements IQuote {
    Quote(String symbol, Date date, Double openPrice, Double highPrice, Double lowPrice, Double closePrice, Double volume){
        this.symbol=symbol;
        this.date=date;
        this.openPrice=openPrice;
        this.highPrice=highPrice;
        this.lowPrice=lowPrice;
        this.closePrice=closePrice;
        this.volume=volume;
    }
    public String getSymbol(){
        return this.symbol;
    }
    public Date getDate(){
        return this.date;
    }
    public double getOpenPrice(){
        return this.openPrice;
    }
    public double getHighPrice(){
        return this.highPrice;
    }
    public double getLowPrice()
    {
        return this.lowPrice;
    }
    public double getClosePrice(){
        return this.closePrice;
    }
    public double getVolume(){
        return this.volume;
    }
    public String toString(){
        String returnString;
        returnString="\""+this.symbol+"\","+this.date.toString()+",Open="+this.openPrice+",High="+this.highPrice
        +",Low="+this.lowPrice+",Close="+this.closePrice+",Volume="+this.volume;
        return returnString;
    }
    @Override
    public boolean equals(Object obj){
        IQuote quote= (IQuote) obj;
        if ((this.symbol.equals(quote.getSymbol()))&&(this.date.equals(quote.getDate()))&&(this.openPrice.equals(quote.getOpenPrice()))&&(this.highPrice.equals(quote.getHighPrice()))
                &&(this.lowPrice.equals(quote.getLowPrice()))&&(this.closePrice.equals(quote.getClosePrice()))){
         return true;
        }
        else
            return false;
    }
    private String symbol;
    private Date date;
    private Double openPrice;
    private Double highPrice;
    private Double lowPrice;
    private Double closePrice;
    private Double volume;
}


