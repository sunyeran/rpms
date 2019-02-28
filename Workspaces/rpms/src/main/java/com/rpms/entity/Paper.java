package com.rpms.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Paper entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "paper", catalog = "rpms")

public class Paper implements java.io.Serializable {

	// Fields

	private Double paperId;
	private User user;
	private String name;
	private String username;
	private String paperName;
	private String firstAuthor;
	private String secondAuthor;
	private String issn;
	private String cn;
	private String volume;
	private String core;
	private String approval;
	private String workload;
	private Timestamp publishTime;
	private Timestamp lastUpdate;

	// Constructors

	/** default constructor */
	public Paper() {
	}

	/** full constructor */
	public Paper(User user, String name, String username, String paperName, String firstAuthor, String secondAuthor,
			String issn, String cn, String volume, String core, String approval, String workload, Timestamp publishTime,
			Timestamp lastUpdate) {
		this.user = user;
		this.name = name;
		this.username = username;
		this.paperName = paperName;
		this.firstAuthor = firstAuthor;
		this.secondAuthor = secondAuthor;
		this.issn = issn;
		this.cn = cn;
		this.volume = volume;
		this.core = core;
		this.approval = approval;
		this.workload = workload;
		this.publishTime = publishTime;
		this.lastUpdate = lastUpdate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "paper_id", unique = true, nullable = false, precision = 22, scale = 0)

	public Double getPaperId() {
		return this.paperId;
	}

	public void setPaperId(Double paperId) {
		this.paperId = paperId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department")

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "name")

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "username")

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "paper_name")

	public String getPaperName() {
		return this.paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	@Column(name = "first_author")

	public String getFirstAuthor() {
		return this.firstAuthor;
	}

	public void setFirstAuthor(String firstAuthor) {
		this.firstAuthor = firstAuthor;
	}

	@Column(name = "second_author")

	public String getSecondAuthor() {
		return this.secondAuthor;
	}

	public void setSecondAuthor(String secondAuthor) {
		this.secondAuthor = secondAuthor;
	}

	@Column(name = "issn")

	public String getIssn() {
		return this.issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	@Column(name = "cn")

	public String getCn() {
		return this.cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	@Column(name = "volume")

	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	@Column(name = "core")

	public String getCore() {
		return this.core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	@Column(name = "approval")

	public String getApproval() {
		return this.approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	@Column(name = "workload")

	public String getWorkload() {
		return this.workload;
	}

	public void setWorkload(String workload) {
		this.workload = workload;
	}

	@Column(name = "publish_time", length = 19)

	public Timestamp getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

	@Column(name = "last_update", length = 19)

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}