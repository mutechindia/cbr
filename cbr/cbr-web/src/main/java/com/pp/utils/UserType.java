package com.pp.utils;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public enum UserType {
	Admin, Student, Teacher, Other;

	public static Map<UserType,UserType> userType() {
		return new LinkedHashMap<UserType,UserType>(){{
			put(UserType.Admin,UserType.Admin);
			put(UserType.Student,UserType.Student);
			put(UserType.Teacher,UserType.Teacher);
			put(UserType.Other,UserType.Other);
		}};

	}

}
