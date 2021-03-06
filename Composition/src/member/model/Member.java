package member.model;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;



public class Member {
  private static final Log log = LogFactory.getLog(Member.class);
  private Integer id;
  private String username;
  private String email;
  private Date memberSinceDate;
  private boolean active;

  private Address address;

  protected Member() {
  }

  public Member(String username) {
    if (username ==null)
      throw new IllegalArgumentException("username must not be null");
    this.username = username;
    this.memberSinceDate = new Date();
    this.active=false;

  }

  public Integer getId() {
    return id;
  }

  protected void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getMemberSinceDate() {
    return memberSinceDate;
  }

  public void setMemberSinceDate(Date memberSinceDate) {
    this.memberSinceDate = memberSinceDate;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public String toString() {
    final StringBuffer sb = new StringBuffer();
    sb.append("Member");
    sb.append("{id=").append(id);
    sb.append(", username='").append(username).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append(", memberSinceDate=").append(memberSinceDate);
    sb.append(", active=").append(active);
    sb.append(", address='").append(address).append('\'');
    sb.append('}');
    return sb.toString();
  }

  public Address getAddress() {
  return address;
  }

  public void setAddress(Address address) {
  this.address = address;
  }


  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    final Member member = (Member) o;

    return username.equals(member.username);

  }

  public int hashCode() {
    return username.hashCode();
  }
}
