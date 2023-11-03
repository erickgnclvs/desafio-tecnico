/*
 * An XML document type.
 * Localname: getEspeciesDeTitulo
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEspeciesDeTituloDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEspeciesDeTitulo(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEspeciesDeTituloDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEspeciesDeTituloDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEspeciesDeTituloDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETESPECIESDETITULO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEspeciesDeTitulo");
    
    
    /**
     * Gets the "getEspeciesDeTitulo" element
     */
    public br.jus.tjsc.www.selo.GetEspeciesDeTitulo getGetEspeciesDeTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEspeciesDeTitulo target = null;
            target = (br.jus.tjsc.www.selo.GetEspeciesDeTitulo)get_store().find_element_user(GETESPECIESDETITULO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEspeciesDeTitulo" element
     */
    public void setGetEspeciesDeTitulo(br.jus.tjsc.www.selo.GetEspeciesDeTitulo getEspeciesDeTitulo)
    {
        generatedSetterHelperImpl(getEspeciesDeTitulo, GETESPECIESDETITULO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEspeciesDeTitulo" element
     */
    public br.jus.tjsc.www.selo.GetEspeciesDeTitulo addNewGetEspeciesDeTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEspeciesDeTitulo target = null;
            target = (br.jus.tjsc.www.selo.GetEspeciesDeTitulo)get_store().add_element_user(GETESPECIESDETITULO$0);
            return target;
        }
    }
}
