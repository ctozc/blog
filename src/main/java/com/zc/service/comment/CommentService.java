package com.zc.service.comment;

import com.zc.dto.cond.CommentCond;
import com.zc.model.CommentDomain;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CommentService {
    void addComment(CommentDomain commentDomain);

    void deleteComment(Integer coid);

    void updateCommentStatus(Integer coid, String status);

    CommentDomain getCommentById(Integer coid);

    List<CommentDomain> getCommentsByCId(Integer cid);

    PageInfo<CommentDomain> getCommentsByCond(CommentCond commentCond, int pageNum, int pageSize);
}
