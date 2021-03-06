package com.treabear.readinglist.repository;

import java.util.List;

import com.treabear.readinglist.domain.Book;
import com.treabear.readinglist.domain.Reader;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ReadingListRepository
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    // 지정한 독자의 이름으로 독서목록을 검색
    List<Book> findByReader(Reader reader);
    
}