package com.wonsi.statrip.model.service;

import com.wonsi.statrip.model.dto.CommentDto;

import java.util.List;

public interface CommentService {
    void addComment(CommentDto commentDto) throws Exception;
    List<CommentDto> commentByShareId(int shareId) throws Exception;
    void deleteCommentById(int commentId) throws Exception;
    void deleteCommentByUserId(String userId) throws Exception;
    void deleteCommentByShareId(int shareId) throws Exception;

}
