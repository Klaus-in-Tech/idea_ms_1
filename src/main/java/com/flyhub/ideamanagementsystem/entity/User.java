package com.flyhub.ideamanagementsystem.entity;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="user_table", schema="public")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID global_user_id;
	private String user_id;
	
    private String first_name;
    private String middle_name;
    private String last_name;
    private String other_name;
    private String full_name;
    
    @JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
    private LocalDateTime date_of_birth;
    private String nin;
    private String primary_phone;
    private String secondary_phone;
    private String primary_email;
    private String secondary_email;
    private String preferred_whatsapp_number;
    
    @JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
    private LocalDateTime create_date;
    private String card_number;
    private String password;
    private String created_by_global_user_id;
    
    @JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
    private LocalDateTime modified_date;
    private String modified_by_global_user_id;
    private Integer tenant_id;
    private Integer postfix_id;
    private Integer gender_id;
    private Integer status_id;
    private Integer country_id;
    private String modified_reason;
    private boolean is_admin;
    private boolean is_super_admin;
    private boolean is_end_user;
    private boolean is_system_account;
    private boolean is_employee;
    
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "user_roles",
			joinColumns = @JoinColumn(
		            name = "user_id", referencedColumnName = "user_id"),
			inverseJoinColumns = @JoinColumn(
				            name = "role_id", referencedColumnName = "id"))
	
	private Collection<UserRole> roles;
    
	public User(String user_id, String first_name, String middle_name, String last_name, String other_name,
			String full_name, LocalDateTime date_of_birth, String nin, String primary_phone, String secondary_phone,
			String primary_email, String secondary_email, String preferred_whatsapp_number, LocalDateTime create_date,
			String card_number, String password, String created_by_global_user_id, LocalDateTime modified_date,
			String modified_by_global_user_id, Integer tenant_id, Integer postfix_id, Integer gender_id,
			Integer status_id, Integer country_id, String modified_reason, boolean is_admin, boolean is_super_admin,
			boolean is_end_user, boolean is_system_account, boolean is_employee) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.other_name = other_name;
		this.full_name = full_name;
		this.date_of_birth = date_of_birth;
		this.nin = nin;
		this.primary_phone = primary_phone;
		this.secondary_phone = secondary_phone;
		this.primary_email = primary_email;
		this.secondary_email = secondary_email;
		this.preferred_whatsapp_number = preferred_whatsapp_number;
		this.create_date = create_date;
		this.card_number = card_number;
		this.password = password;
		this.created_by_global_user_id = created_by_global_user_id;
		this.modified_date = modified_date;
		this.modified_by_global_user_id = modified_by_global_user_id;
		this.tenant_id = tenant_id;
		this.postfix_id = postfix_id;
		this.gender_id = gender_id;
		this.status_id = status_id;
		this.country_id = country_id;
		this.modified_reason = modified_reason;
		this.is_admin = is_admin;
		this.is_super_admin = is_super_admin;
		this.is_end_user = is_end_user;
		this.is_system_account = is_system_account;
		this.is_employee = is_employee;
	}



	public User(String firstName, String lastName, String email, String password2, List<UserRole> asList) {
	}




	public UUID getGlobal_user_id() {
		return global_user_id;
	}

	public void setGlobal_user_id(UUID global_user_id) {
		this.global_user_id = global_user_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getOther_name() {
		return other_name;
	}

	public void setOther_name(String other_name) {
		this.other_name = other_name;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public LocalDateTime getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDateTime date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getNin() {
		return nin;
	}

	public void setNin(String nin) {
		this.nin = nin;
	}

	public String getPrimary_phone() {
		return primary_phone;
	}

	public void setPrimary_phone(String primary_phone) {
		this.primary_phone = primary_phone;
	}

	public String getSecondary_phone() {
		return secondary_phone;
	}

	public void setSecondary_phone(String secondary_phone) {
		this.secondary_phone = secondary_phone;
	}

	public String getPrimary_email() {
		return primary_email;
	}

	public void setPrimary_email(String primary_email) {
		this.primary_email = primary_email;
	}

	public String getSecondary_email() {
		return secondary_email;
	}

	public void setSecondary_email(String secondary_email) {
		this.secondary_email = secondary_email;
	}

	public String getPreferred_whatsapp_number() {
		return preferred_whatsapp_number;
	}

	public void setPreferred_whatsapp_number(String preferred_whatsapp_number) {
		this.preferred_whatsapp_number = preferred_whatsapp_number;
	}

	public LocalDateTime getCreate_date() {
		return create_date;
	}

	public void setCreate_date(LocalDateTime create_date) {
		this.create_date = create_date;
	}

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreated_by_global_user_id() {
		return created_by_global_user_id;
	}

	public void setCreated_by_global_user_id(String created_by_global_user_id) {
		this.created_by_global_user_id = created_by_global_user_id;
	}

	public LocalDateTime getModified_date() {
		return modified_date;
	}

	public void setModified_date(LocalDateTime modified_date) {
		this.modified_date = modified_date;
	}

	public String getModified_by_global_user_id() {
		return modified_by_global_user_id;
	}

	public void setModified_by_global_user_id(String modified_by_global_user_id) {
		this.modified_by_global_user_id = modified_by_global_user_id;
	}

	public Integer getTenant_id() {
		return tenant_id;
	}

	public void setTenant_id(Integer tenant_id) {
		this.tenant_id = tenant_id;
	}

	public Integer getPostfix_id() {
		return postfix_id;
	}

	public void setPostfix_id(Integer postfix_id) {
		this.postfix_id = postfix_id;
	}

	public Integer getGender_id() {
		return gender_id;
	}

	public void setGender_id(Integer gender_id) {
		this.gender_id = gender_id;
	}

	public Integer getStatus_id() {
		return status_id;
	}

	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}

	public Integer getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public String getModified_reason() {
		return modified_reason;
	}

	public void setModified_reason(String modified_reason) {
		this.modified_reason = modified_reason;
	}

	public boolean isIs_admin() {
		return is_admin;
	}

	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}

	public boolean isIs_super_admin() {
		return is_super_admin;
	}

	public void setIs_super_admin(boolean is_super_admin) {
		this.is_super_admin = is_super_admin;
	}

	public boolean isIs_end_user() {
		return is_end_user;
	}

	public void setIs_end_user(boolean is_end_user) {
		this.is_end_user = is_end_user;
	}

	public boolean isIs_system_account() {
		return is_system_account;
	}

	public void setIs_system_account(boolean is_system_account) {
		this.is_system_account = is_system_account;
	}

	public boolean isIs_employee() {
		return is_employee;
	}

	public void setIs_employee(boolean is_employee) {
		this.is_employee = is_employee;
	}
    
    
    
    

}
