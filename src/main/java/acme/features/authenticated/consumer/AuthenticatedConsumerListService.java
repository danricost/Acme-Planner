package acme.features.authenticated.consumer;

import org.springframework.stereotype.Service;

import acme.entities.roles.Consumer;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractUpdateService;

@Service
public class AuthenticatedConsumerListService implements AbstractUpdateService<Authenticated, Consumer> {

	@Override
	public boolean authorise(final Request<Consumer> request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void bind(final Request<Consumer> request, final Consumer entity, final Errors errors) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unbind(final Request<Consumer> request, final Consumer entity, final Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Consumer findOne(final Request<Consumer> request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validate(final Request<Consumer> request, final Consumer entity, final Errors errors) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(final Request<Consumer> request, final Consumer entity) {
		// TODO Auto-generated method stub
		
	}

}
