/*
 * XML Type:  decodificaRecibo
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.DecodificaRecibo
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML decodificaRecibo(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class DecodificaReciboImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.DecodificaRecibo
{
    private static final long serialVersionUID = 1L;
    
    public DecodificaReciboImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USER$0 = 
        new javax.xml.namespace.QName("", "user");
    private static final javax.xml.namespace.QName PASS$2 = 
        new javax.xml.namespace.QName("", "pass");
    private static final javax.xml.namespace.QName RECIBO$4 = 
        new javax.xml.namespace.QName("", "recibo");
    
    
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
     * Gets the "recibo" element
     */
    public byte[] getRecibo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECIBO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "recibo" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetRecibo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(RECIBO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "recibo" element
     */
    public boolean isSetRecibo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECIBO$4) != 0;
        }
    }
    
    /**
     * Sets the "recibo" element
     */
    public void setRecibo(byte[] recibo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECIBO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECIBO$4);
            }
            target.setByteArrayValue(recibo);
        }
    }
    
    /**
     * Sets (as xml) the "recibo" element
     */
    public void xsetRecibo(org.apache.xmlbeans.XmlBase64Binary recibo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(RECIBO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(RECIBO$4);
            }
            target.set(recibo);
        }
    }
    
    /**
     * Unsets the "recibo" element
     */
    public void unsetRecibo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECIBO$4, 0);
        }
    }
}
