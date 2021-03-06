package io.musika.notifier.application;

import io.musika.notifier.domain.model.release.ReleaseEvent;
import io.musika.notifier.domain.model.release.UnableToCreateReleaseEventException;
import io.musika.notifier.domain.model.shared.kernel.ReleaseNumber;
import io.musika.notifier.domain.model.shared.kernel.TrackId;

import java.net.URI;
import java.util.Date;

/**
 * Release event service.
 *
 * @author Sylvain Lecoy <sylvain.lecoy@gmail.com>
 */
public interface ReleaseEventService {

	/**
	 * Registers a release event in the system, and notifies interested
	 * parties that a track has been released.
	 *
	 * @param eventTime when the event was received
	 * @param trackId track id
	 * @param releaseNumber release number
	 * @param uriCode URI of the store
	 * @param type type of event
	 */
	void registerReleaseEvent(Date eventTime /* TODO: Check Java 8 date type to use. */,
							  TrackId trackId,
							  ReleaseNumber releaseNumber,
							  URI uriCode,
							  ReleaseEvent.Type type) throws UnableToCreateReleaseEventException;

}
