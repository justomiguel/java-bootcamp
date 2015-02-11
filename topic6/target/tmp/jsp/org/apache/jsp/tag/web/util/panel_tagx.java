package org.apache.jsp.tag.web.util;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class panel_tagx
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_escapeBody_javaScriptEscape;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String id;
  private java.lang.String title;
  private java.lang.Boolean render;
  private java.lang.String openPane;
  private java.lang.String z;

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public java.lang.Boolean getRender() {
    return this.render;
  }

  public void setRender(java.lang.Boolean render) {
    this.render = render;
  }

  public java.lang.String getOpenPane() {
    return this.openPane;
  }

  public void setOpenPane(java.lang.String openPane) {
    this.openPane = openPane;
  }

  public java.lang.String getZ() {
    return this.z;
  }

  public void setZ(java.lang.String z) {
    this.z = z;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_spring_escapeBody_javaScriptEscape = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_spring_escapeBody_javaScriptEscape.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_set_var.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getId() != null ) {
      _jspx_page_context.setAttribute("id", getId());
}
    if( getTitle() != null ) {
      _jspx_page_context.setAttribute("title", getTitle());
}
    if( getRender() != null ) {
      _jspx_page_context.setAttribute("render", getRender());
}
    if( getOpenPane() != null ) {
      _jspx_page_context.setAttribute("openPane", getOpenPane());
}
    if( getZ() != null ) {
      _jspx_page_context.setAttribute("z", getZ());
}

    try {
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty render or render}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("<script type=\"text/javascript\">");
        out.write("dojo.require('dijit.TitlePane');");
        out.write("</script>");
        out.write("<div id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("_title_${sec_id}_id", java.lang.String.class, (PageContext)this.getJspContext(), null) + "\">");
        out.write("<script type=\"text/javascript\">");
        out.write("Spring.addDecoration(new Spring.ElementDecoration({elementId : '_title_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sec_id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("_id', widgetType : 'dijit.TitlePane', widgetAttrs : {title: '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sec_title}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("', open: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sec_openPane}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("}})); ");
        out.write("</script>");
        ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
        _jspx_sout = null;
        if (getJspBody() != null)
          getJspBody().invoke(_jspx_sout);
        out.write("</div>");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty openPane}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_0.setVar("openPane");
    _jspx_th_c_set_0.setValue(new String("true"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_1.setVar("sec_id");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_1.doInitBody();
      }
      do {
        if (_jspx_meth_spring_escapeBody_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_set_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_spring_escapeBody_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:escapeBody
    org.springframework.web.servlet.tags.EscapeBodyTag _jspx_th_spring_escapeBody_0 = (org.springframework.web.servlet.tags.EscapeBodyTag) _jspx_tagPool_spring_escapeBody_javaScriptEscape.get(org.springframework.web.servlet.tags.EscapeBodyTag.class);
    _jspx_th_spring_escapeBody_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_escapeBody_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_1);
    _jspx_th_spring_escapeBody_0.setJavaScriptEscape("true");
    int[] _jspx_push_body_count_spring_escapeBody_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_escapeBody_0 = _jspx_th_spring_escapeBody_0.doStartTag();
      if (_jspx_eval_spring_escapeBody_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_spring_escapeBody_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_spring_escapeBody_0[0]++;
          _jspx_th_spring_escapeBody_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_spring_escapeBody_0.doInitBody();
        }
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          int evalDoAfterBody = _jspx_th_spring_escapeBody_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_spring_escapeBody_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_spring_escapeBody_0[0]--;
      }
      if (_jspx_th_spring_escapeBody_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_escapeBody_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_escapeBody_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_escapeBody_0.doFinally();
      _jspx_tagPool_spring_escapeBody_javaScriptEscape.reuse(_jspx_th_spring_escapeBody_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_2.setVar("sec_openPane");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_eval_c_set_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_2.doInitBody();
      }
      do {
        if (_jspx_meth_spring_escapeBody_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_set_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_spring_escapeBody_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:escapeBody
    org.springframework.web.servlet.tags.EscapeBodyTag _jspx_th_spring_escapeBody_1 = (org.springframework.web.servlet.tags.EscapeBodyTag) _jspx_tagPool_spring_escapeBody_javaScriptEscape.get(org.springframework.web.servlet.tags.EscapeBodyTag.class);
    _jspx_th_spring_escapeBody_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_escapeBody_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_2);
    _jspx_th_spring_escapeBody_1.setJavaScriptEscape("true");
    int[] _jspx_push_body_count_spring_escapeBody_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_escapeBody_1 = _jspx_th_spring_escapeBody_1.doStartTag();
      if (_jspx_eval_spring_escapeBody_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_spring_escapeBody_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_spring_escapeBody_1[0]++;
          _jspx_th_spring_escapeBody_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_spring_escapeBody_1.doInitBody();
        }
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${openPane}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          int evalDoAfterBody = _jspx_th_spring_escapeBody_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_spring_escapeBody_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_spring_escapeBody_1[0]--;
      }
      if (_jspx_th_spring_escapeBody_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_escapeBody_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_escapeBody_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_escapeBody_1.doFinally();
      _jspx_tagPool_spring_escapeBody_javaScriptEscape.reuse(_jspx_th_spring_escapeBody_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_3.setVar("sec_title");
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_eval_c_set_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_3.doInitBody();
      }
      do {
        if (_jspx_meth_spring_escapeBody_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_set_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_spring_escapeBody_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:escapeBody
    org.springframework.web.servlet.tags.EscapeBodyTag _jspx_th_spring_escapeBody_2 = (org.springframework.web.servlet.tags.EscapeBodyTag) _jspx_tagPool_spring_escapeBody_javaScriptEscape.get(org.springframework.web.servlet.tags.EscapeBodyTag.class);
    _jspx_th_spring_escapeBody_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_escapeBody_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_3);
    _jspx_th_spring_escapeBody_2.setJavaScriptEscape("true");
    int[] _jspx_push_body_count_spring_escapeBody_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_escapeBody_2 = _jspx_th_spring_escapeBody_2.doStartTag();
      if (_jspx_eval_spring_escapeBody_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_spring_escapeBody_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_spring_escapeBody_2[0]++;
          _jspx_th_spring_escapeBody_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_spring_escapeBody_2.doInitBody();
        }
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          int evalDoAfterBody = _jspx_th_spring_escapeBody_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_spring_escapeBody_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_spring_escapeBody_2[0]--;
      }
      if (_jspx_th_spring_escapeBody_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_escapeBody_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_escapeBody_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_escapeBody_2.doFinally();
      _jspx_tagPool_spring_escapeBody_javaScriptEscape.reuse(_jspx_th_spring_escapeBody_2);
    }
    return false;
  }
}
