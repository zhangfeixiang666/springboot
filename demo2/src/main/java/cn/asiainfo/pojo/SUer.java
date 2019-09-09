package cn.asiainfo.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/6 15:36
 * @Version 1.0
 */
@Table(name="s_user")
public class SUer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String uid;
	private String psw1;
	private String psw2;
	private String email;
	private String nickname;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPsw1() {
		return psw1;
	}

	public void setPsw1(String psw1) {
		this.psw1 = psw1;
	}

	public String getPsw2() {
		return psw2;
	}

	public void setPsw2(String psw2) {
		this.psw2 = psw2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "SUer{" +
				"id=" + id +
				", uid='" + uid + '\'' +
				", psw1='" + psw1 + '\'' +
				", psw2='" + psw2 + '\'' +
				", email='" + email + '\'' +
				", nickname='" + nickname + '\'' +
				'}';
	}
}
