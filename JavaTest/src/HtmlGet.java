import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

public class HtmlGet {
    public static void main(String[] args) {
        //
    	try {
            // 得到浏览器对象，直接New一个就能得到，现在就好比说你得到了一个浏览器了
            WebClient webclient = new WebClient();
 
            // 不加載css
            webclient.getOptions().setCssEnabled(false);
            //加載js
            webclient.getOptions().setJavaScriptEnabled(false);
            webclient.getOptions().setThrowExceptionOnScriptError(false); //js執行錯誤時，是否拋出異常  
            webclient.getOptions().setTimeout(60000);
            webclient.getOptions().setUseInsecureSSL(true);
            // 做的第一件事，去拿到这个网页，只需要调用getPage这个方法即可
//            HtmlPage htmlpage = webclient.getPage("http://news.baidu.com/advanced_news.html");
            HtmlPage htmlpage = webclient.getPage("http://localhost:8080/SpringMVCHibernateWithSpringSecurityExample/main/login");
            // 根据名字得到一个表单，查看上面这个网页的源代码可以发现表单的名字叫“f”
//            final HtmlForm form = htmlpage.getFormByName("f");
            final HtmlForm form = htmlpage.getFormByName("yaya");
            System.out.println(form);
            // 同样道理，获取”百度一下“这个按钮
//            final HtmlSubmitInput button = form.getInputByValue("百度一下");
            final HtmlSubmitInput button = form.getInputByValue("Log in");
            System.out.println(button);
            // 得到搜索框
//            final HtmlTextInput textField = form.getInputByName("q1");
            final HtmlTextInput textField1 = form.getInputByName("ssoId");
            final HtmlTextInput textField2 = form.getInputByName("password");
//            System.out.println(textField);
 
            //
//            textField.setValueAttribute("周星驰");
            textField1.setValueAttribute("admin");
            textField2.setValueAttribute("00000");
            // 输入好了，我们点一下这个按钮
            final HtmlPage nextPage = button.click();
            // 我把结果转成String
            System.out.println(nextPage);
 
            String result = nextPage.asXml();
 
            System.out.println(result);
        } catch (Exception e) {
 
            e.printStackTrace();
        }
      }
    }