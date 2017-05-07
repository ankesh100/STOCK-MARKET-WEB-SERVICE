/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author ankesh
 */
@WebService(serviceName = "stock_market")
public class stock_market {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Stock")
    public String[] hello(@WebParam(name = "sym") String symbol) {
         Stock s=StockFetcher.getStock(symbol);
         String[] res=new String[18];
         res[0]="Name:"+s.getName();
         res[1]=" Currency:"+s.getCurrency();
         res[2]=" Exchange:"+s.getExchange();
         res[3]=" Symbol:"+s.getSymbol();
         res[4]=" DayHigh:"+s.getDayhigh();
         res[5]=" DayLow:"+s.getDaylow();
         res[6]=" Eps:"+s.getEps();
         res[7]=" Marketcap:"+s.getMarketcap();
         res[8]=" Movingav50day:"+s.getMovingav50day();
         res[9]=" OpeningPrice:"+s.getOpen();
         res[11]=" Pe:"+s.getPe();
         res[12]=" PreviousClose:"+s.getPreviousClose();
         res[13]=" Price:"+s.getPrice();        
         res[14]=" ShortRatio:"+s.getShortRatio();
         res[15]=" Volume:"+s.getVolume();
         res[16]=" Week52high:"+s.getWeek52high();
         res[17]=" Week50Low:"+s.getWeek52low();

                 
                 return res;
                 //s.getName()+" Symbol:"+s.getSymbol()+" Day High:"+s.getDayhigh()+" DayLow:"+s.getDaylow();
         
    }
}
