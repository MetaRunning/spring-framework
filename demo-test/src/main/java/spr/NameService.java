package spr;

import org.springframework.stereotype.Component;

/**
 * @ author: zhongyuan.shi
 * @ create: 2020-05-14 21:54
 * @ Description:
 **/
@Component(value = "nameService")
public class NameService {

	public String getName() {
		return "name";
	}

}
