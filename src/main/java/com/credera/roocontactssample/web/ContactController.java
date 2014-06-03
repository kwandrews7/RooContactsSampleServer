package com.credera.roocontactssample.web;
import com.credera.roocontactssample.domain.Contact;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RooWebJson(jsonObject = Contact.class)
@Controller
@RequestMapping("/contacts")
@RooWebScaffold(path = "contacts", formBackingObject = Contact.class)
public class ContactController {
}
