/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformers;

import Entities.UsrSubscriber;
import Entities.UsrSubscriberRole;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import screenObject.UserSO;

/**
 *
 * @author Ehab
 */
public class UserTransformer extends AbstractTransformer<UsrSubscriber, UserSO> {

    @Override
    public UserSO fromEntityToScreen(UsrSubscriber entity) {
        UserSO user = new UserSO();
        user.setCode(entity.getCode());
        user.setName(entity.getName());
        user.setPassword(entity.getPassword());
//        List<String> userRoles = new ArrayList<>();
//
//        Iterator iterator = entity.getUsrSubscriberRoles().iterator();
//        while (iterator.hasNext()) {
//            UsrSubscriberRole role = (UsrSubscriberRole) iterator.next();
//            userRoles.add(role.getUsrRole().getCode());
//        }
//        user.setRoles(userRoles);
        
        return user;
    }

    @Override
    public UsrSubscriber fromScreenToEntity(UserSO screenObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
