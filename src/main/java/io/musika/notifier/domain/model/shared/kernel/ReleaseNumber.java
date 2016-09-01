package io.musika.notifier.domain.model.shared.kernel;

import static org.apache.commons.lang3.Validate.notNull;

import java.io.Serializable;

import io.musika.notifier.domain.model.shared.ValueObject;

/**
 * Identifies a release.
 */
public final class ReleaseNumber implements ValueObject<ReleaseNumber>, Serializable {

	private String number;

	public ReleaseNumber(final String number) {
		notNull(number);

		this.number = number;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (!(o instanceof ReleaseNumber)) return false;

		ReleaseNumber other = (ReleaseNumber) o;

		return sameValueAs(other);
	}

	@Override
	public int hashCode() {
		return number.hashCode();
	}

    @Override
    public boolean sameValueAs(final ReleaseNumber other) {
        return other != null && this.number.equals(other.number);
    }

	ReleaseNumber() {
		// Needed by Hibernate
	}

}
