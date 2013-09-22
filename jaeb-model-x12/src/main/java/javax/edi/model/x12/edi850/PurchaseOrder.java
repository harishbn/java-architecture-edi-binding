package javax.edi.model.x12.edi850;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.edi850.segment.Detail;
import javax.edi.model.x12.edi850.segment.Summary;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;

@EDIMessage(segmentDelimiter="~",componentDelimiter=">",elementDelimiter="*")
public class PurchaseOrder {

	@NotNull
	private InterchangeEnvelopeHeader interchangeEnvelope;
	
	@NotNull
	private GroupEnvelopeHeader groupEnvelope;
	
	@NotNull
	@Size(min = 1, max = 1)
	private PurchaseOrderHeader heading;
	
	@NotNull
	@Size(min = 1, max = 1)
	private Detail detail;
	
	@NotNull
	@Size(min = 1, max = 1)
	private Summary summary;

	
	
	
	
	public InterchangeEnvelopeHeader getInterchangeEnvelope() {
		return interchangeEnvelope;
	}

	public void setInterchangeEnvelope(InterchangeEnvelopeHeader interchangeEnvelope) {
		this.interchangeEnvelope = interchangeEnvelope;
	}

	public GroupEnvelopeHeader getGroupEnvelope() {
		return groupEnvelope;
	}

	public void setGroupEnvelope(GroupEnvelopeHeader groupEnvelope) {
		this.groupEnvelope = groupEnvelope;
	}

	public PurchaseOrderHeader getHeading() {
		return heading;
	}

	public void setHeading(PurchaseOrderHeader heading) {
		this.heading = heading;
	}

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}
	
	
	
}
