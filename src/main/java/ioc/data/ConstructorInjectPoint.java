package ioc.data;

import java.lang.reflect.Constructor;
import java.util.List;

public class ConstructorInjectPoint implements InjectPoint {
	private Constructor constructor;
	private List<BeanIdentifier> dependencies;

	public ConstructorInjectPoint(Constructor constructor, List<BeanIdentifier> dependencies) {
		this.constructor = constructor;
		this.dependencies = dependencies;
	}

	public Object newInstance(Object[] params) {
		try {
			return constructor.newInstance(params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * do nothing
	 */
	public void inject(Object instance, Object... params) {
	}

	public List<BeanIdentifier> getDependencies() {
		return this.dependencies;
	}
}
