/* Generated By:JJTree: Do not edit this line. SimpleNode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package mezic.parser;

public class SimpleNode implements Node, java.io.Serializable {

  private static final long serialVersionUID = 6335230350848016013L;
  protected Node parent;
  protected Node[] children;
  protected int id;
  protected Object value;
  protected Parser parser;
  protected Token firstToken;
  protected Token lastToken;

  public SimpleNode() {
    System.out.println("Default constructor is called");
  }

  public SimpleNode(int i) {
    id = i;
  }

  public SimpleNode(Parser p, int i) {
    this(i);
    parser = p;
  }

  public void jjtOpen() {
  }

  public void jjtClose() {
  }

  public void jjtSetParent(Node n) {
    parent = n;
  }

  public Node jjtGetParent() {
    return parent;
  }

  public void jjtAddChild(Node n, int i) {
    if (children == null) {
      children = new Node[i + 1];
    } else if (i >= children.length) {
      Node [] c = new Node[i + 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = n;
  }

  public Node jjtGetChild(int i) {
    return children[i];
  }

  public int jjtGetNumChildren() {
    return (children == null) ? 0 : children.length;
  }

  public void jjtSetValue(Object value) {
    this.value = value;
  }

  public Object jjtGetValue() {
    return value;
  }

  public Token jjtGetFirstToken() {
    return firstToken;
  }

  public void jjtSetFirstToken(Token token) {
    this.firstToken = token;
  }

  public Token jjtGetLastToken() {
    return lastToken;
  }

  public void jjtSetLastToken(Token token) {
    this.lastToken = token;
  }

  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws mezic.compiler.CompileException {
    return visitor.visit(this, data);
  }

  /** Accept the visitor. **/
  public Object childrenAccept(ParserVisitor visitor, Object data) throws mezic.compiler.CompileException {
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        children[i].jjtAccept(visitor, data);
      }
    }
    return data;
  }

  /*
   * You can override these two methods in subclasses of SimpleNode to customize
   * the way the node appears when the tree is dumped. If your output uses more
   * than one line you should override toString(String), otherwise overriding
   * toString() is probably all you need to do.
   */

  public String toString() {
    return ParserTreeConstants.jjtNodeName[id];
  }

  public String toString(String prefix) {
    return prefix + toString();
  }

  /*
   * Override this method if you want to customize how the node dumps out its
   * children.
   */

  public void dump(String prefix) {
    System.out.println(toString(prefix));
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        SimpleNode n = (SimpleNode) children[i];
        if (n != null) {
          n.dump(prefix + " ");
        }
      }
    }
  }
}

/*
 * JavaCC - OriginalChecksum=aaadd0deb82ef66d8280eccaddab9679 (do not edit this
 * line)
 */
