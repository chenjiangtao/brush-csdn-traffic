package whm.brush.csdnandcnblogs;

import java.util.List;

import static whm.brush.csdnandcnblogs.JsoupGetArticleUrl.getJbakeBlogsUrl;
import static whm.brush.csdnandcnblogs.JsoupGetIp.getForeignIp;
import static whm.brush.csdnandcnblogs.JsoupGetIp.getIp;
import static whm.brush.csdnandcnblogs.JsoupGetIp.visitJbake;

/**
 * Created by 185378641@qq.com on 2017/11/26.
 *
 * @author jiangtao
 */
public class MainCsdn {


    public static void main(String[] args) {
        //1.想http代理地址api发起请求，获得想要的代理ip地址
        String url = "http://www.xicidaili.com/nn/";
        String foreignUrl = "http://www.kuaidaili.com/free/outha/";
        final List<AgencyIp> ipList = getForeignIp();
//        final List<AgencyIp> ipList = Arrays.asList(new AgencyIp("178.62.123.38","8118"));
        ipList.addAll(getIp(url));

//        List<String> urls = getCsdnBlogsUrl(); // csdn
        List<String> urls = getJbakeBlogsUrl(); //jbake

        urls.add("https://s01.flagcounter.com/map/i6UK/size_s/txt_000000/border_CCCCCC/pageviews_1/viewers_0/flags_0");
//        List<String> urls = Arrays.asList("http://blog.csdn.net/evane1890/article/details/77718751");
        for (final String u:urls){
            new Thread(new Runnable() {

                public void run() {
                    System.out.println("文章地址:" + u);
//                    visit(u,ipList);// csdn
                    visitJbake(u,ipList); // jbake
                }
            }).start();
        }
    }
}
