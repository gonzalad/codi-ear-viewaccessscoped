package tmp.pag.codi;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;
import org.omnifaces.util.Messages;

@Named
@ViewAccessScoped
@SuppressWarnings("serial")
public class PingController implements Serializable {

	private String value;

	@PostConstruct
	public void initialize() {
		System.out.println("@PostConstruct");
		Messages.addGlobalInfo("@PostConstruct");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("@PreDestroy");
		Messages.addGlobalInfo("@PreDestroy");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}