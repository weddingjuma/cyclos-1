/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.22
 * Generated at: 2014-10-10 16:36:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.access.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class virtualKeyboardDefinitions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/taglibs/c.tld", Long.valueOf(1359113636000L));
    _jspx_dependants.put("/WEB-INF/taglibs/struts-bean.tld", Long.valueOf(1359113636000L));
    _jspx_dependants.put("/WEB-INF/taglibs/cyclos-core.tld", Long.valueOf(1359113636000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcyclos_005fscript_0026_005fsrc_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcyclos_005fescapeJS;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcyclos_005fscript_0026_005fsrc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcyclos_005fescapeJS = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fcyclos_005fscript_0026_005fsrc_005fnobody.release();
    _005fjspx_005ftagPool_005fcyclos_005fescapeJS.release();
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /pages/access/includes/virtualKeyboardDefinitions.jsp(4,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessSettings.virtualKeyboard || accessSettings.virtualKeyboardTransactionPassword}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write('	');
        if (_jspx_meth_cyclos_005fscript_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t<script>\n");
        out.write("\t\tvar fullLabel = \"");
        if (_jspx_meth_cyclos_005fescapeJS_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\";\n");
        out.write("\t\tvar capsLockLabel = \"");
        if (_jspx_meth_cyclos_005fescapeJS_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\";\n");
        out.write("\t\tvar contrastLabel = \"");
        if (_jspx_meth_cyclos_005fescapeJS_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\";\n");
        out.write("\t\tvar clearLabel = \"");
        if (_jspx_meth_cyclos_005fescapeJS_005f3(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\";\n");
        out.write("\t\tvar submitLabel = \"");
        if (_jspx_meth_cyclos_005fescapeJS_005f4(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\";\n");
        out.write("\t</script>\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_cyclos_005fscript_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cyclos:script
    nl.strohalm.cyclos.taglibs.ScriptTag _jspx_th_cyclos_005fscript_005f0 = (nl.strohalm.cyclos.taglibs.ScriptTag) _005fjspx_005ftagPool_005fcyclos_005fscript_0026_005fsrc_005fnobody.get(nl.strohalm.cyclos.taglibs.ScriptTag.class);
    _jspx_th_cyclos_005fscript_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cyclos_005fscript_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /pages/access/includes/virtualKeyboardDefinitions.jsp(5,1) name = src type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cyclos_005fscript_005f0.setSrc("/pages/scripts/virtualKeyboard.js");
    int _jspx_eval_cyclos_005fscript_005f0 = _jspx_th_cyclos_005fscript_005f0.doStartTag();
    if (_jspx_th_cyclos_005fscript_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcyclos_005fscript_0026_005fsrc_005fnobody.reuse(_jspx_th_cyclos_005fscript_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcyclos_005fscript_0026_005fsrc_005fnobody.reuse(_jspx_th_cyclos_005fscript_005f0);
    return false;
  }

  private boolean _jspx_meth_cyclos_005fescapeJS_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cyclos:escapeJS
    nl.strohalm.cyclos.taglibs.EscapeJSTag _jspx_th_cyclos_005fescapeJS_005f0 = (nl.strohalm.cyclos.taglibs.EscapeJSTag) _005fjspx_005ftagPool_005fcyclos_005fescapeJS.get(nl.strohalm.cyclos.taglibs.EscapeJSTag.class);
    _jspx_th_cyclos_005fescapeJS_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cyclos_005fescapeJS_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_cyclos_005fescapeJS_005f0 = _jspx_th_cyclos_005fescapeJS_005f0.doStartTag();
    if (_jspx_eval_cyclos_005fescapeJS_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cyclos_005fescapeJS_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cyclos_005fescapeJS_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cyclos_005fescapeJS_005f0.doInitBody();
      }
      do {
        if (_jspx_meth_bean_005fmessage_005f0(_jspx_th_cyclos_005fescapeJS_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cyclos_005fescapeJS_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cyclos_005fescapeJS_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cyclos_005fescapeJS_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcyclos_005fescapeJS.reuse(_jspx_th_cyclos_005fescapeJS_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcyclos_005fescapeJS.reuse(_jspx_th_cyclos_005fescapeJS_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cyclos_005fescapeJS_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f0 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cyclos_005fescapeJS_005f0);
    // /pages/access/includes/virtualKeyboardDefinitions.jsp(7,36) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f0.setKey("virtualKeyboard.full");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_cyclos_005fescapeJS_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cyclos:escapeJS
    nl.strohalm.cyclos.taglibs.EscapeJSTag _jspx_th_cyclos_005fescapeJS_005f1 = (nl.strohalm.cyclos.taglibs.EscapeJSTag) _005fjspx_005ftagPool_005fcyclos_005fescapeJS.get(nl.strohalm.cyclos.taglibs.EscapeJSTag.class);
    _jspx_th_cyclos_005fescapeJS_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cyclos_005fescapeJS_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_cyclos_005fescapeJS_005f1 = _jspx_th_cyclos_005fescapeJS_005f1.doStartTag();
    if (_jspx_eval_cyclos_005fescapeJS_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cyclos_005fescapeJS_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cyclos_005fescapeJS_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cyclos_005fescapeJS_005f1.doInitBody();
      }
      do {
        if (_jspx_meth_bean_005fmessage_005f1(_jspx_th_cyclos_005fescapeJS_005f1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cyclos_005fescapeJS_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cyclos_005fescapeJS_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cyclos_005fescapeJS_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcyclos_005fescapeJS.reuse(_jspx_th_cyclos_005fescapeJS_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fcyclos_005fescapeJS.reuse(_jspx_th_cyclos_005fescapeJS_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cyclos_005fescapeJS_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f1 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cyclos_005fescapeJS_005f1);
    // /pages/access/includes/virtualKeyboardDefinitions.jsp(8,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f1.setKey("virtualKeyboard.capsLock");
    int _jspx_eval_bean_005fmessage_005f1 = _jspx_th_bean_005fmessage_005f1.doStartTag();
    if (_jspx_th_bean_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_cyclos_005fescapeJS_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cyclos:escapeJS
    nl.strohalm.cyclos.taglibs.EscapeJSTag _jspx_th_cyclos_005fescapeJS_005f2 = (nl.strohalm.cyclos.taglibs.EscapeJSTag) _005fjspx_005ftagPool_005fcyclos_005fescapeJS.get(nl.strohalm.cyclos.taglibs.EscapeJSTag.class);
    _jspx_th_cyclos_005fescapeJS_005f2.setPageContext(_jspx_page_context);
    _jspx_th_cyclos_005fescapeJS_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_cyclos_005fescapeJS_005f2 = _jspx_th_cyclos_005fescapeJS_005f2.doStartTag();
    if (_jspx_eval_cyclos_005fescapeJS_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cyclos_005fescapeJS_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cyclos_005fescapeJS_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cyclos_005fescapeJS_005f2.doInitBody();
      }
      do {
        if (_jspx_meth_bean_005fmessage_005f2(_jspx_th_cyclos_005fescapeJS_005f2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cyclos_005fescapeJS_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cyclos_005fescapeJS_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cyclos_005fescapeJS_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcyclos_005fescapeJS.reuse(_jspx_th_cyclos_005fescapeJS_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fcyclos_005fescapeJS.reuse(_jspx_th_cyclos_005fescapeJS_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_cyclos_005fescapeJS_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f2 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cyclos_005fescapeJS_005f2);
    // /pages/access/includes/virtualKeyboardDefinitions.jsp(9,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f2.setKey("virtualKeyboard.contrast");
    int _jspx_eval_bean_005fmessage_005f2 = _jspx_th_bean_005fmessage_005f2.doStartTag();
    if (_jspx_th_bean_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_cyclos_005fescapeJS_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cyclos:escapeJS
    nl.strohalm.cyclos.taglibs.EscapeJSTag _jspx_th_cyclos_005fescapeJS_005f3 = (nl.strohalm.cyclos.taglibs.EscapeJSTag) _005fjspx_005ftagPool_005fcyclos_005fescapeJS.get(nl.strohalm.cyclos.taglibs.EscapeJSTag.class);
    _jspx_th_cyclos_005fescapeJS_005f3.setPageContext(_jspx_page_context);
    _jspx_th_cyclos_005fescapeJS_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_cyclos_005fescapeJS_005f3 = _jspx_th_cyclos_005fescapeJS_005f3.doStartTag();
    if (_jspx_eval_cyclos_005fescapeJS_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cyclos_005fescapeJS_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cyclos_005fescapeJS_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cyclos_005fescapeJS_005f3.doInitBody();
      }
      do {
        if (_jspx_meth_bean_005fmessage_005f3(_jspx_th_cyclos_005fescapeJS_005f3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cyclos_005fescapeJS_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cyclos_005fescapeJS_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cyclos_005fescapeJS_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcyclos_005fescapeJS.reuse(_jspx_th_cyclos_005fescapeJS_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fcyclos_005fescapeJS.reuse(_jspx_th_cyclos_005fescapeJS_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_cyclos_005fescapeJS_005f3, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f3 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cyclos_005fescapeJS_005f3);
    // /pages/access/includes/virtualKeyboardDefinitions.jsp(10,37) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f3.setKey("global.clear");
    int _jspx_eval_bean_005fmessage_005f3 = _jspx_th_bean_005fmessage_005f3.doStartTag();
    if (_jspx_th_bean_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_cyclos_005fescapeJS_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cyclos:escapeJS
    nl.strohalm.cyclos.taglibs.EscapeJSTag _jspx_th_cyclos_005fescapeJS_005f4 = (nl.strohalm.cyclos.taglibs.EscapeJSTag) _005fjspx_005ftagPool_005fcyclos_005fescapeJS.get(nl.strohalm.cyclos.taglibs.EscapeJSTag.class);
    _jspx_th_cyclos_005fescapeJS_005f4.setPageContext(_jspx_page_context);
    _jspx_th_cyclos_005fescapeJS_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_cyclos_005fescapeJS_005f4 = _jspx_th_cyclos_005fescapeJS_005f4.doStartTag();
    if (_jspx_eval_cyclos_005fescapeJS_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cyclos_005fescapeJS_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cyclos_005fescapeJS_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cyclos_005fescapeJS_005f4.doInitBody();
      }
      do {
        if (_jspx_meth_bean_005fmessage_005f4(_jspx_th_cyclos_005fescapeJS_005f4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cyclos_005fescapeJS_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cyclos_005fescapeJS_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cyclos_005fescapeJS_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcyclos_005fescapeJS.reuse(_jspx_th_cyclos_005fescapeJS_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fcyclos_005fescapeJS.reuse(_jspx_th_cyclos_005fescapeJS_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_cyclos_005fescapeJS_005f4, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f4 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cyclos_005fescapeJS_005f4);
    // /pages/access/includes/virtualKeyboardDefinitions.jsp(11,38) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f4.setKey("global.submit");
    int _jspx_eval_bean_005fmessage_005f4 = _jspx_th_bean_005fmessage_005f4.doStartTag();
    if (_jspx_th_bean_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f4);
    return false;
  }
}
