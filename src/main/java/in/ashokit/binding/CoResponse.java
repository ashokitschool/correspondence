package in.ashokit.binding;

import lombok.Data;

@Data
public class CoResponse {

	private Long totalTriggers;

	private Long succTriggers;

	private Long failedTrigger;

}
