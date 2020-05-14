import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import spr.FoodService;
import spr.MoneyService;
import spr.NameService;

/**
 * @ author: zhongyuan.shi
 * @ create: 2020-05-14 20:42
 * @ Description:
 **/
public class AppTest {

	/**
	 * 循环依赖
	 */
	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		MoneyService moneyService = (MoneyService) context.getBean("moneyService");
		System.out.println(moneyService.getFromFood());

		FoodService foodService = (FoodService) context.getBean("foodService");
		System.out.println(foodService.getFromMoney());
	}


	@Test
	public void test() {
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
//		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
//		System.out.println(myTestBean.getName());


//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		NameService nameService = (NameService) context.getBean("nameService");
//		System.out.println(nameService.getName());

	}

}
