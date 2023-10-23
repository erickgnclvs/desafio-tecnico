/*
 * XML Type:  getSelosPedido
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosPedido
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getSelosPedido(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetSelosPedidoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosPedido
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosPedidoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USER$0 = 
        new javax.xml.namespace.QName("", "user");
    private static final javax.xml.namespace.QName PASS$2 = 
        new javax.xml.namespace.QName("", "pass");
    private static final javax.xml.namespace.QName NUPEDIDO$4 = 
        new javax.xml.namespace.QName("", "nupedido");
    private static final javax.xml.namespace.QName ISENTO$6 = 
        new javax.xml.namespace.QName("", "isento");
    
    
    /**
     * Gets the "user" element
     */
    public java.lang.String getUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "user" element
     */
    public org.apache.xmlbeans.XmlString xgetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "user" element
     */
    public boolean isSetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USER$0) != 0;
        }
    }
    
    /**
     * Sets the "user" element
     */
    public void setUser(java.lang.String user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USER$0);
            }
            target.setStringValue(user);
        }
    }
    
    /**
     * Sets (as xml) the "user" element
     */
    public void xsetUser(org.apache.xmlbeans.XmlString user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USER$0);
            }
            target.set(user);
        }
    }
    
    /**
     * Unsets the "user" element
     */
    public void unsetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USER$0, 0);
        }
    }
    
    /**
     * Gets the "pass" element
     */
    public java.lang.String getPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pass" element
     */
    public org.apache.xmlbeans.XmlString xgetPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "pass" element
     */
    public boolean isSetPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PASS$2) != 0;
        }
    }
    
    /**
     * Sets the "pass" element
     */
    public void setPass(java.lang.String pass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASS$2);
            }
            target.setStringValue(pass);
        }
    }
    
    /**
     * Sets (as xml) the "pass" element
     */
    public void xsetPass(org.apache.xmlbeans.XmlString pass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASS$2);
            }
            target.set(pass);
        }
    }
    
    /**
     * Unsets the "pass" element
     */
    public void unsetPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PASS$2, 0);
        }
    }
    
    /**
     * Gets the "nupedido" element
     */
    public long getNupedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUPEDIDO$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "nupedido" element
     */
    public org.apache.xmlbeans.XmlLong xgetNupedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUPEDIDO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "nupedido" element
     */
    public boolean isSetNupedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUPEDIDO$4) != 0;
        }
    }
    
    /**
     * Sets the "nupedido" element
     */
    public void setNupedido(long nupedido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUPEDIDO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUPEDIDO$4);
            }
            target.setLongValue(nupedido);
        }
    }
    
    /**
     * Sets (as xml) the "nupedido" element
     */
    public void xsetNupedido(org.apache.xmlbeans.XmlLong nupedido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUPEDIDO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NUPEDIDO$4);
            }
            target.set(nupedido);
        }
    }
    
    /**
     * Unsets the "nupedido" element
     */
    public void unsetNupedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUPEDIDO$4, 0);
        }
    }
    
    /**
     * Gets the "isento" element
     */
    public boolean getIsento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISENTO$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isento" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISENTO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "isento" element
     */
    public boolean isSetIsento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISENTO$6) != 0;
        }
    }
    
    /**
     * Sets the "isento" element
     */
    public void setIsento(boolean isento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISENTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISENTO$6);
            }
            target.setBooleanValue(isento);
        }
    }
    
    /**
     * Sets (as xml) the "isento" element
     */
    public void xsetIsento(org.apache.xmlbeans.XmlBoolean isento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISENTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISENTO$6);
            }
            target.set(isento);
        }
    }
    
    /**
     * Unsets the "isento" element
     */
    public void unsetIsento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISENTO$6, 0);
        }
    }
}
