package com.salon.controller.checklist;

import com.salon.repository.bean.checklist.CheckListBean;
import com.salon.service.checklist.CheckListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checklist")
public class CheckListController {
	
	@Autowired
    private CheckListService checkListService;

    
    public void setCheckListService(CheckListService checkListService) {
        this.checkListService = checkListService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CheckListBean findById(@PathVariable("id") long id) {return checkListService.findById(id); }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<CheckListBean> findAllCheckList() { return checkListService.findAll(); }

    @RequestMapping(method = RequestMethod.POST)
    public CheckListBean createCheckList(@RequestBody CheckListBean checkListBean) { return checkListService.save(checkListBean); }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") long id) {
        checkListService.delete(checkListService.findById(id));
    }

    @RequestMapping(method = RequestMethod.PUT)
    public CheckListBean updateCheckList(@RequestBody CheckListBean checkListBean) {
        return checkListService.update(checkListBean);
    }
}