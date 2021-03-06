package jodd.madvoc;

/**
 * Common base implementation of {@link ActionWrapper}.
 */
public abstract class BaseActionWrapper implements ActionWrapper {

	protected boolean enabled = true;

	protected boolean initialized;

	/**
	 * Returns <code>true</code> if interceptor is initialized.
	 */
	public final boolean isInitialized() {
	    return initialized;
	}

	/**
	 * Returns <code>true</code> if interceptor is enabled.
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Defines if interceptor is enabled.
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Invoked on interceptor initialization.
	 */
	public void init() {
		initialized = true;
	}

}