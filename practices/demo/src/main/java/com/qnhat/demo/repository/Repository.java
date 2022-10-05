package com.qnhat.demo.repository;

import java.util.List;

public interface Repository <T>{
    List<T> findAll();
}
