@Controller
public class UserContrller }

	@RequestMapping("/user/login.do")
	public String login() {
		logger.info("경로:login")

		return "user/login";
	}

	@RequestMapping("/user/insert.do")
	public String insert() {
		logger.info("경로:insert")
		
		return "user/insert";
	}

	@RequestMapping("/user/update.do")
	public String update() {
		logger.info("경로:update")
	
		return "user/update";
	}
	
	// master 브랜치에 주석 추가
	// 회원탈퇴시 세션 삭제
	@RequestMapping("/user/delete.do")
	public String delete() {
		logger.info("경로:delete")
	
		return "user/delete";
	}


}