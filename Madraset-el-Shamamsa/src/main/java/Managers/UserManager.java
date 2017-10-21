/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import DAO.UserDAO;
import Entities.UsrSubscriber;
import Transformers.UserTransformer;
import screenObject.UserSO;

/**
 *
 * @author Ehab
 */
public class UserManager extends AbstractManager<UsrSubscriber, UserSO> {

    public UserManager() {
        super(new UserDAO(), new UserTransformer());
    }

}
