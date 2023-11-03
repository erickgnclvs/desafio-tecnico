/*
 * XML Type:  reciboProtocolo
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.ReciboProtocolo
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML reciboProtocolo(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class ReciboProtocoloImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.ReciboProtocolo
{
    private static final long serialVersionUID = 1L;
    
    public ReciboProtocoloImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMONNAME$0 = 
        new javax.xml.namespace.QName("", "commonName");
    private static final javax.xml.namespace.QName DATA$2 = 
        new javax.xml.namespace.QName("", "data");
    private static final javax.xml.namespace.QName EMAIL$4 = 
        new javax.xml.namespace.QName("", "email");
    private static final javax.xml.namespace.QName ESTADO$6 = 
        new javax.xml.namespace.QName("", "estado");
    private static final javax.xml.namespace.QName HASHCERTIFICADO$8 = 
        new javax.xml.namespace.QName("", "hashCertificado");
    private static final javax.xml.namespace.QName HASHDOCUMENTO$10 = 
        new javax.xml.namespace.QName("", "hashDocumento");
    private static final javax.xml.namespace.QName LOCALIDADE$12 = 
        new javax.xml.namespace.QName("", "localidade");
    private static final javax.xml.namespace.QName OIDPOLITICA$14 = 
        new javax.xml.namespace.QName("", "OIDpolitica");
    private static final javax.xml.namespace.QName ORGANIZACAO$16 = 
        new javax.xml.namespace.QName("", "organizacao");
    private static final javax.xml.namespace.QName PAIS$18 = 
        new javax.xml.namespace.QName("", "pais");
    private static final javax.xml.namespace.QName SERIAL$20 = 
        new javax.xml.namespace.QName("", "serial");
    private static final javax.xml.namespace.QName STATUS$22 = 
        new javax.xml.namespace.QName("", "status");
    private static final javax.xml.namespace.QName UNIDADEORGANIZACIONAL$24 = 
        new javax.xml.namespace.QName("", "unidadeOrganizacional");
    private static final javax.xml.namespace.QName VERSAO$26 = 
        new javax.xml.namespace.QName("", "versao");
    
    
    /**
     * Gets the "commonName" element
     */
    public java.lang.String getCommonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "commonName" element
     */
    public org.apache.xmlbeans.XmlString xgetCommonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "commonName" element
     */
    public boolean isSetCommonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMONNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "commonName" element
     */
    public void setCommonName(java.lang.String commonName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMONNAME$0);
            }
            target.setStringValue(commonName);
        }
    }
    
    /**
     * Sets (as xml) the "commonName" element
     */
    public void xsetCommonName(org.apache.xmlbeans.XmlString commonName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMONNAME$0);
            }
            target.set(commonName);
        }
    }
    
    /**
     * Unsets the "commonName" element
     */
    public void unsetCommonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMONNAME$0, 0);
        }
    }
    
    /**
     * Gets the "data" element
     */
    public java.lang.String getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "data" element
     */
    public org.apache.xmlbeans.XmlString xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$2) != 0;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(java.lang.String data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$2);
            }
            target.setStringValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlString data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$2);
            }
            target.set(data);
        }
    }
    
    /**
     * Unsets the "data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$2, 0);
        }
    }
    
    /**
     * Gets the "email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$4) != 0;
        }
    }
    
    /**
     * Sets the "email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$4);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "email" element
     */
    public void xsetEmail(org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$4);
            }
            target.set(email);
        }
    }
    
    /**
     * Unsets the "email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$4, 0);
        }
    }
    
    /**
     * Gets the "estado" element
     */
    public java.lang.String getEstado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "estado" element
     */
    public org.apache.xmlbeans.XmlString xgetEstado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTADO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "estado" element
     */
    public boolean isSetEstado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTADO$6) != 0;
        }
    }
    
    /**
     * Sets the "estado" element
     */
    public void setEstado(java.lang.String estado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADO$6);
            }
            target.setStringValue(estado);
        }
    }
    
    /**
     * Sets (as xml) the "estado" element
     */
    public void xsetEstado(org.apache.xmlbeans.XmlString estado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTADO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTADO$6);
            }
            target.set(estado);
        }
    }
    
    /**
     * Unsets the "estado" element
     */
    public void unsetEstado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTADO$6, 0);
        }
    }
    
    /**
     * Gets the "hashCertificado" element
     */
    public java.lang.String getHashCertificado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHCERTIFICADO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hashCertificado" element
     */
    public org.apache.xmlbeans.XmlString xgetHashCertificado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASHCERTIFICADO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "hashCertificado" element
     */
    public boolean isSetHashCertificado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASHCERTIFICADO$8) != 0;
        }
    }
    
    /**
     * Sets the "hashCertificado" element
     */
    public void setHashCertificado(java.lang.String hashCertificado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHCERTIFICADO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASHCERTIFICADO$8);
            }
            target.setStringValue(hashCertificado);
        }
    }
    
    /**
     * Sets (as xml) the "hashCertificado" element
     */
    public void xsetHashCertificado(org.apache.xmlbeans.XmlString hashCertificado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASHCERTIFICADO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASHCERTIFICADO$8);
            }
            target.set(hashCertificado);
        }
    }
    
    /**
     * Unsets the "hashCertificado" element
     */
    public void unsetHashCertificado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASHCERTIFICADO$8, 0);
        }
    }
    
    /**
     * Gets the "hashDocumento" element
     */
    public java.lang.String getHashDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHDOCUMENTO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hashDocumento" element
     */
    public org.apache.xmlbeans.XmlString xgetHashDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASHDOCUMENTO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "hashDocumento" element
     */
    public boolean isSetHashDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASHDOCUMENTO$10) != 0;
        }
    }
    
    /**
     * Sets the "hashDocumento" element
     */
    public void setHashDocumento(java.lang.String hashDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHDOCUMENTO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASHDOCUMENTO$10);
            }
            target.setStringValue(hashDocumento);
        }
    }
    
    /**
     * Sets (as xml) the "hashDocumento" element
     */
    public void xsetHashDocumento(org.apache.xmlbeans.XmlString hashDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASHDOCUMENTO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASHDOCUMENTO$10);
            }
            target.set(hashDocumento);
        }
    }
    
    /**
     * Unsets the "hashDocumento" element
     */
    public void unsetHashDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASHDOCUMENTO$10, 0);
        }
    }
    
    /**
     * Gets the "localidade" element
     */
    public java.lang.String getLocalidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALIDADE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "localidade" element
     */
    public org.apache.xmlbeans.XmlString xgetLocalidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALIDADE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "localidade" element
     */
    public boolean isSetLocalidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALIDADE$12) != 0;
        }
    }
    
    /**
     * Sets the "localidade" element
     */
    public void setLocalidade(java.lang.String localidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALIDADE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALIDADE$12);
            }
            target.setStringValue(localidade);
        }
    }
    
    /**
     * Sets (as xml) the "localidade" element
     */
    public void xsetLocalidade(org.apache.xmlbeans.XmlString localidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALIDADE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALIDADE$12);
            }
            target.set(localidade);
        }
    }
    
    /**
     * Unsets the "localidade" element
     */
    public void unsetLocalidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALIDADE$12, 0);
        }
    }
    
    /**
     * Gets the "OIDpolitica" element
     */
    public java.lang.String getOIDpolitica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OIDPOLITICA$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OIDpolitica" element
     */
    public org.apache.xmlbeans.XmlString xgetOIDpolitica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OIDPOLITICA$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "OIDpolitica" element
     */
    public boolean isSetOIDpolitica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OIDPOLITICA$14) != 0;
        }
    }
    
    /**
     * Sets the "OIDpolitica" element
     */
    public void setOIDpolitica(java.lang.String oiDpolitica)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OIDPOLITICA$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OIDPOLITICA$14);
            }
            target.setStringValue(oiDpolitica);
        }
    }
    
    /**
     * Sets (as xml) the "OIDpolitica" element
     */
    public void xsetOIDpolitica(org.apache.xmlbeans.XmlString oiDpolitica)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OIDPOLITICA$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OIDPOLITICA$14);
            }
            target.set(oiDpolitica);
        }
    }
    
    /**
     * Unsets the "OIDpolitica" element
     */
    public void unsetOIDpolitica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OIDPOLITICA$14, 0);
        }
    }
    
    /**
     * Gets the "organizacao" element
     */
    public java.lang.String getOrganizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZACAO$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "organizacao" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZACAO$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "organizacao" element
     */
    public boolean isSetOrganizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZACAO$16) != 0;
        }
    }
    
    /**
     * Sets the "organizacao" element
     */
    public void setOrganizacao(java.lang.String organizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZACAO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZACAO$16);
            }
            target.setStringValue(organizacao);
        }
    }
    
    /**
     * Sets (as xml) the "organizacao" element
     */
    public void xsetOrganizacao(org.apache.xmlbeans.XmlString organizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZACAO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZACAO$16);
            }
            target.set(organizacao);
        }
    }
    
    /**
     * Unsets the "organizacao" element
     */
    public void unsetOrganizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZACAO$16, 0);
        }
    }
    
    /**
     * Gets the "pais" element
     */
    public java.lang.String getPais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAIS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pais" element
     */
    public org.apache.xmlbeans.XmlString xgetPais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAIS$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "pais" element
     */
    public boolean isSetPais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAIS$18) != 0;
        }
    }
    
    /**
     * Sets the "pais" element
     */
    public void setPais(java.lang.String pais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAIS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAIS$18);
            }
            target.setStringValue(pais);
        }
    }
    
    /**
     * Sets (as xml) the "pais" element
     */
    public void xsetPais(org.apache.xmlbeans.XmlString pais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAIS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAIS$18);
            }
            target.set(pais);
        }
    }
    
    /**
     * Unsets the "pais" element
     */
    public void unsetPais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAIS$18, 0);
        }
    }
    
    /**
     * Gets the "serial" element
     */
    public java.lang.String getSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIAL$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serial" element
     */
    public org.apache.xmlbeans.XmlString xgetSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERIAL$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "serial" element
     */
    public boolean isSetSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIAL$20) != 0;
        }
    }
    
    /**
     * Sets the "serial" element
     */
    public void setSerial(java.lang.String serial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIAL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERIAL$20);
            }
            target.setStringValue(serial);
        }
    }
    
    /**
     * Sets (as xml) the "serial" element
     */
    public void xsetSerial(org.apache.xmlbeans.XmlString serial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERIAL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERIAL$20);
            }
            target.set(serial);
        }
    }
    
    /**
     * Unsets the "serial" element
     */
    public void unsetSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIAL$20, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$22) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$22);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$22);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$22, 0);
        }
    }
    
    /**
     * Gets the "unidadeOrganizacional" element
     */
    public java.lang.String getUnidadeOrganizacional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIDADEORGANIZACIONAL$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "unidadeOrganizacional" element
     */
    public org.apache.xmlbeans.XmlString xgetUnidadeOrganizacional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIDADEORGANIZACIONAL$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "unidadeOrganizacional" element
     */
    public boolean isSetUnidadeOrganizacional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIDADEORGANIZACIONAL$24) != 0;
        }
    }
    
    /**
     * Sets the "unidadeOrganizacional" element
     */
    public void setUnidadeOrganizacional(java.lang.String unidadeOrganizacional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIDADEORGANIZACIONAL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIDADEORGANIZACIONAL$24);
            }
            target.setStringValue(unidadeOrganizacional);
        }
    }
    
    /**
     * Sets (as xml) the "unidadeOrganizacional" element
     */
    public void xsetUnidadeOrganizacional(org.apache.xmlbeans.XmlString unidadeOrganizacional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIDADEORGANIZACIONAL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNIDADEORGANIZACIONAL$24);
            }
            target.set(unidadeOrganizacional);
        }
    }
    
    /**
     * Unsets the "unidadeOrganizacional" element
     */
    public void unsetUnidadeOrganizacional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIDADEORGANIZACIONAL$24, 0);
        }
    }
    
    /**
     * Gets the "versao" element
     */
    public java.lang.String getVersao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSAO$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "versao" element
     */
    public org.apache.xmlbeans.XmlString xgetVersao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSAO$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "versao" element
     */
    public boolean isSetVersao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSAO$26) != 0;
        }
    }
    
    /**
     * Sets the "versao" element
     */
    public void setVersao(java.lang.String versao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSAO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSAO$26);
            }
            target.setStringValue(versao);
        }
    }
    
    /**
     * Sets (as xml) the "versao" element
     */
    public void xsetVersao(org.apache.xmlbeans.XmlString versao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSAO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSAO$26);
            }
            target.set(versao);
        }
    }
    
    /**
     * Unsets the "versao" element
     */
    public void unsetVersao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSAO$26, 0);
        }
    }
}
