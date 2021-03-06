package ioc.data;

import java.lang.reflect.Method;
import java.util.List;

public class MethodInjectPoint implements InjectPoint {

	private Method method;
	List<BeanIdentifier> dependencies;

	public MethodInjectPoint(Method method, List<BeanIdentifier> dependencies) {
		this.method = method;
		this.dependencies = dependencies;
	}

	public void inject(Object instance, Object... params) {
		boolean isAccessiable = method.isAccessible();
		method.setAccessible(true);
		try {
			method.invoke(instance, params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		method.setAccessible(isAccessiable);
	}

	public List<BeanIdentifier> getDependencies() {
		return dependencies;
	}

}
