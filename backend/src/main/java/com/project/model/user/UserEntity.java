package com.project.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {
    
	@Id
	private long uid; // uid
	private String upw; // passwd
    private String email; // email
    private String name;  // 이름
    private String phone; // phone
    private String address; // address
    private String createDate; // 생성일
    private String sendDate;
    private String profile;    //
    private int usertype;      // 회원 유형

	
	public UserEntity() {};

	public UserEntity(long uid, String upw, String email, String name, String phone, String address, String createDate,
			String sendDate, String profile, int usertype) {
		super();
		this.uid = uid;
		this.upw = upw;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.createDate = createDate;
		this.sendDate = sendDate;
		this.profile = profile;
		this.usertype = usertype;
	}
	
	
}