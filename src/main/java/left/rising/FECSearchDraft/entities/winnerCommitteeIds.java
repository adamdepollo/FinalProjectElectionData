package left.rising.FECSearchDraft.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="winner_committee_ids")
public class winnerCommitteeIds {

	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String committeeId;
	
	@ManyToOne
	private LocationSearchResult locationSearchResultAssigned;

	public winnerCommitteeIds() {
		super();
	}
	
	public winnerCommitteeIds(String committeeId) {
		super();
		this.committeeId = committeeId;
	}

	public winnerCommitteeIds(Integer id, String committeeId, LocationSearchResult locationSearchResultAssigned) {
		super();
		this.id = id;
		this.committeeId = committeeId;
		this.locationSearchResultAssigned = locationSearchResultAssigned;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommitteeId() {
		return committeeId;
	}

	public void setCommitteeId(String committeeId) {
		this.committeeId = committeeId;
	}

	public LocationSearchResult getLocationSearchResultAssigned() {
		return locationSearchResultAssigned;
	}

	public void setLocationSearchResultAssigned(LocationSearchResult locationSearchResultAssigned) {
		this.locationSearchResultAssigned = locationSearchResultAssigned;
	}
	
}
