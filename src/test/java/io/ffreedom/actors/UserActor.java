package io.ffreedom.actors;

import akka.actor.Props;
import io.ffreedom.actors.reference.SingleGenericActor;

public class UserActor extends SingleGenericActor<User> {
//    private Object parameters;

	public static Props props() {
		return Props.create(UserActor.class, UserActor::new);
	}

	// 如果有构造参数, 便按照如下方式构造 Props 即可
//    public static Props props(Object parameters) {
//        return Props.create(UserLoginActor.class, () -> new UserLoginActor(parameters));
//    }
//
//    private UserLoginActor(Object parameters) {
//        this.parameters = parameters;
//    }

	@Override
	protected void onEvent(User user) {
		System.out.println("received user -> userId==[" + user.getUserId() + "], userName==[" + user.getUserName()
				+ "], age==[" + user.getAge() + "]");
	}

	@Override
	protected Class<User> eventType() {
		return User.class;
	}

	@Override
	protected void handleUnknown0(Object t) {
		// TODO Auto-generated method stub

	}

}