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
	
	// 회원 탈퇴시 회원 세션 정보 삭제
	@RequestMapping("/user/delete.do")
	public String delete() {
		logger.info("경로:delete")
	
		return "user/delete";
	}


}