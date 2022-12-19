package com.grocerymanagementsystem.util;

import org.springframework.beans.BeanUtils;

import com.grocerymanagementsystem.entity.User;
import com.grocerymanagementsystem.model.UserDTO;



public class UserConverter
{
	//convert from userDTO to entity(user)
		public User convertToUserEntity(UserDTO userDTO)
		{
			User user = new User();
			if(userDTO!=null)
			{
				BeanUtils.copyProperties(userDTO, user);
			}
			return user;
		}
		
		//convert from entity to userDTO
		public UserDTO convertToUserDTO(User user)
		{
			UserDTO userDTO = new UserDTO();
			if(user!=null)
			{
				BeanUtils.copyProperties(user, userDTO);
			}
			return userDTO;
		}
	
	

}
